package com.jpmc.midascore;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.jpmc.midascore.foundation.Transaction;

@Service
public class TransactionListener{

    @KafkaListener(
        topics = "${general.kafka-topic}",
        groupId = "midas-group"
    )
    public void listener(Transaction transaction){
        
       System.out.println("Tests coming out");
        System.out.println(transaction);
        //transaction.toString();
    }
}
