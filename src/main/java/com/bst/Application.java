package com.bst;

import com.bst.configuration.Config;
import com.bst.logger.options.Color;
import com.bst.logger.ConsolePrinter;
import com.bst.logger.options.Emoji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    ConsolePrinter printer;
    @Autowired
    Config config;

    @Override
    public void run(ApplicationArguments args) {
        printer.bold().uppercase().emoji(Emoji.INFO).print("[Test automation configuration settings]:").reset();
        printer.color(Color.BLUE).print("[Driver details]: " + config.driverDetails().toString());
        printer.print("[Environment details]: " + config.environment().toString());
        printer.print("[Timeout details]: " + config.timeout().toString()).reset();
        printer.bold().uppercase().emoji(Emoji.INFO).print("[Overridden arguments]:").color(Color.BLUE);
        args.getNonOptionArgs().forEach(printer::print);
        printer.reset();
        config.environment().prepareUsers();
    }

}
