import CustomArrayList.CustomArrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList myArray = new CustomArrayList();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.remove(1);
        System.out.println(myArray.size());
    }

}
