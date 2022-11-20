public class main1 {
    public static void main(String[] args) {
        String text = "каждый каждый охотник желает желает знать знать, где сидит фазан";

        String[] mas = text.split(",?\\s+");

        for(int i = 0; i<mas.length ;i++)
        {
            if(i>0 && mas[i].equals(mas[i-1])){
                continue;
            }
            System.out.println(mas[i]);
        }

    }
}
