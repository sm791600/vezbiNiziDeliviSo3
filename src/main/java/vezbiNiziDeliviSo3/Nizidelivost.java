/*Напиши програма со која ќе внесуваш броеви во низа и потоа ќе ги испечатиш
броевите кои не се деливи со 3.*/

package vezbiNiziDeliviSo3;
import java.util.Scanner;
public class Nizidelivost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner vnes = new Scanner(System.in);
System.out.println("Vnesi kolku elementi ima nizata");
int n=vnes.nextInt();
int niza[]=new int[n];
System.out.println("Vnesi gi elementite na nizata");
for(int i=0; i<n; i++) {
	System.out.println(i+" --> ");
	niza[i]=vnes.nextInt();
	}

for(int i=0; i<niza.length; i++) {
	if(niza[i]%3!=0)
		System.out.println("niza["+i+"]= "+niza[i]);
}


	}

}
