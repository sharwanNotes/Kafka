package com.happy.coding;

import com.happy.coding.entity.WikimediaData;
import com.happy.coding.repository.WikimediaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static  final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
   private WikimediaRepository wikimediaRepository;

    public KafkaConsumer(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "mygroup"
    )
    public void consume(String eventMessage){
LOGGER.info(String.format("Event message is receving from producer ->%s",eventMessage));
        WikimediaData wikimediaData=new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        wikimediaRepository.save(wikimediaData);
    }
}
