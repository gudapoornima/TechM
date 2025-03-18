package com.app;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyInputRunner implements CommandLineRunner{
	public void run(String...args) throws Exception{
		System.out.println("Hii  Executing CommandLine Runner");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
	}
}
