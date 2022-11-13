public class Zad2PD4 {
    static void UmieszczanieSumowanie()
    {
        int sumaP=0;
        int sumaNP=0;
        int [] dane = new int [100];
        for(int i=0;i<100;i++)
        {
            dane[i]=i+1;
        }
        for(int j: dane)
        {
            System.out.println(j);
            if(j%2==0)
            {
                sumaP+=j;
                System.out.println("Liczba parzysta: "+j);
            }
            if(j%2==1)
            {
                sumaNP+=j;
                System.out.println("Liczba nieparzysta: "+j);
            }
        }
        System.out.println("Suma liczb nieparzystych: "+sumaNP);
        System.out.println("Suma liczb parzystych: "+sumaP);
    }
}
