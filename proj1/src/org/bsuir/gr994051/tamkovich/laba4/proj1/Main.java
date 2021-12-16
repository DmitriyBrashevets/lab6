package org.bsuir.gr994051.tamkovich.laba4.proj1;

import org.bsuir.gr994051.tamkovich.laba4.proj1.util.ConsolePrinter;

public class Main {
	public static void main(String[] args) {
		if (args.length == 1) {
			String content = args[0];
			new ConsolePrinter().print(content);
		}
	}
}
