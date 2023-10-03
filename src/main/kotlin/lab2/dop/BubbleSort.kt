package lab2.dop

class BubbleSort<T: Comparable<T>> {
    fun sort(arr: MutableList<T>) {
        for (i in 0 until arr.size - 1) {
            for (j in 0 until arr.size - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }
}