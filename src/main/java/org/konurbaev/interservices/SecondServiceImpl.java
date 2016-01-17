package org.konurbaev.interservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class SecondServiceImpl implements SecondService {

    private final static Logger logger = LoggerFactory.getLogger(SecondService.class);

    @Autowired
    private FirstService firstService;

    public void printHello(){
        System.out.println("SecondService Hello");
    }

    @PostConstruct
    private void start() {
        System.out.println("PostConstruct SecondService");
    }

}