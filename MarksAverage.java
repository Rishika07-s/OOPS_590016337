class MarksAverage {
    public static void main(String[] args) {

        int[] marks = {67, 89, 87, 96};
        int Avg;
        int Sum = 0;

        for (int element : marks) {
            Sum = Sum + element;
        }

        Avg = Sum / marks.length;

        System.out.println(Avg);
    }
}
