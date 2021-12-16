package org.bsuir.gr994051.tamkovich.laba4.proj2;

import org.bsuir.gr994051.tamkovich.laba4.proj2.helper.Printer;

public class Main {

	public static void main(String[] args) {
		if (args.length == 1) {
			String content = args[0];
			new Printer().print(content);
		}
	}
}
