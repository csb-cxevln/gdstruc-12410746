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
            // reversed the sign
            if (arr[i] < arr[i + 1]){
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
        // look for the smallest value first
        int smallestIndex = 0;

        for(int i = 1; i <= lastSortedIndex; i++)
        {
            if (arr[i] < arr[smallestIndex]) // smaller value
            {
                smallestIndex = i;
            }
        }

        // put the smallest value at the end
        int temp = arr[lastSortedIndex];
        arr[lastSortedIndex] = arr[smallestIndex];
        arr[smallestIndex] = temp;
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