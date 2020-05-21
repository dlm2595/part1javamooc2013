public class Main {
  public static void main(String[] args) {
    // write test code here
    // Person pekka = new Person("Pekka", 15, 2, 1993);
    Person pekka = new Person("Pekka", 15, 2, 1983);
    Person martin = new Person("Martin", 1, 3, 1983);

    System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
    System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
    
    
    Person steve = new Person("Thomas", 1, 3, 1955);

    System.out.println( steve.getName() + " age " + steve.age() + " years");
    System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    
    MyDate first = new MyDate(24, 12, 2009);
    MyDate second = new MyDate(1, 1, 2011);
    MyDate third = new MyDate(25, 12, 2010);

    System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
    System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
    System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
    System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
    System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
    System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );
  }
}
