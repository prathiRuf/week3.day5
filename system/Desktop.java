package org.system;

//week3.day5 Assignment OOPs concept- Assignment1-single inheritance
/*
 *Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.

 * */
 
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The Desktop Size is 13 inch");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}
