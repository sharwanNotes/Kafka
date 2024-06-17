import React, { useEffect, useState } from 'react';
import { deleteEmployee, listEmployees } from '../services/EmployeeService';
import { useNavigate } from 'react-router-dom';
const ListEmployeeComponents = () => {
    const [employees, setEmployees] = useState([]);
    const navigator = useNavigate();
    useEffect(() => {
        getAllEmployee();
    }, []);

function getAllEmployee(){
    listEmployees()
            .then((response) => {
                setEmployees(response.data);
            })
            .catch((error) => {
                console.error('Error fetching employees:', error);
            });
}

    function addNewEmployee() {
        navigator('/add-employee')
    }

    function updateEmployee(empId) {
        navigator(`/edit-employee/${empId}`)
    }

    function removeEmployee(empId) {
        console.log(empId);
        deleteEmployee(empId).then((response) =>{
            getAllEmployee();
        }).catch(error => {
            console.error(error);
        })
    }
    return (
        <div className='container'>
            <h2 className='text-center'>List of Employees</h2>
            <button className='btn btn-primary mb-2' onClick={addNewEmployee}>Add Employee</button>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>Employee Id</th>
                        <th>Employee First Name</th>
                        <th>Employee Last Name</th>
                        <th>Employee Email</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {employees.map(employee => (
                        <tr key={employee.empId}>
                            <td>{employee.empId}</td>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>
                            <td>
                                <button className='btn btn-info' onClick={() => updateEmployee(employee.empId)}>Update</button>
                                <button className='btn btn-danger' onClick={() => removeEmployee(employee.empId)}
                                style={{marginLeft:'10px'}}
                                >Delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default ListEmployeeComponents;
