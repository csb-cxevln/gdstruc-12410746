//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void printArrayElements(int[] arr)
{
    for (int j : arr) {
        System.out.print(j + " ");
    }
}

void bubbleSort(int[] arr)
{
    for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
    {
        for (int i = 0; i < lastSortedIndex; i++)
        {
            if (arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

}

void selectionSort(int[] arr)
{
    for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
    {
        int largestIndex = 0;

        for(int i = 1; i <= lastSortedIndex; i++)
        {
            if (arr[i] > arr[largestIndex])
            {
                largestIndex = i;
            }
        }

        int temp = arr[lastSortedIndex];
        arr[lastSortedIndex] = arr[largestIndex];
        arr[largestIndex] = temp;
    }
}

void main()
{
    int[] numbers = new int[10];

    numbers[0] = 12;
    numbers[1] = 45;
    numbers[2] = 127;
    numbers[3] = 78;
    numbers[4] = 72;
    numbers[5] = -6;
    numbers[6] = -91;
    numbers[7] = 2;
    numbers[8] = -26;
    numbers[9] = 112;

    System.out.println("Before selection sort: ");
    printArrayElements(numbers);

    selectionSort(numbers);

    System.out.println("\n\nAfter selection sort: ");
    printArrayElements(numbers);

}