package org.konurbaev.interservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class FirstServiceImpl implements FirstService {

    private final static Logger logger = LoggerFactory.getLogger(FirstServiceImpl.class);

    @Autowired
    private SecondService secondService;

    public void printHello(){
        System.out.println("FirstService Hello");
    }

    @PostConstruct
    private void start() {
        System.out.println("PostConstruct FirstService");
    }

}