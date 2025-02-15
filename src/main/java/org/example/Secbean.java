package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


public class Secbean {
    @Bean
    pc pc1(){
        pc pc = new pc();
        pc.setCPU("Intel i5-12450h");
        pc.setGPU("Rtx 3050");
        pc.setRAM("16gb");
        pc.setHDD("1024gb");
        return pc;
    }
    @Bean
    pc pc2(){
        pc pc = new pc();
        pc.setCPU("Intel i7-12450h");
        pc.setGPU("Rtx 3070");
        pc.setRAM("16gb");
        pc.setHDD("1024gb");
        return pc;
    }

    @Primary
    @Bean
    pc pc3(){
        pc pc = new pc();
        pc.setCPU("AMD R3500x");
        pc.setGPU("Rtx 3080");
        pc.setRAM("16gb");
        pc.setHDD("1024gb");
        return pc;
    }
}

