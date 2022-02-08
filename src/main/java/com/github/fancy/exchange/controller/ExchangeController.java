package com.github.fancy.exchange.controller;

import com.github.fancy.exchange.model.ExchangeValue;
import com.github.fancy.exchange.repository.ExchangeValueRepository;
import com.github.fancy.exchange.model.FixerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

@RestController
public class ExchangeController {

    Logger logger = LoggerFactory.getLogger(ExchangeController.class);

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;


    FixerApi fixerApi = new FixerApi();

    @GetMapping("/currency-exchage/from{from}/to{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        try {
            URL url = new URL(fixerApi.getLatestRate() + from + to);
            ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);

            exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

            return exchangeValue;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

}
