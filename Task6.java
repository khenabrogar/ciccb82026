public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {
            951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
            615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
            386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
            399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
            815, 67, 104, 842, 58, 12, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
            958, 609, 845, 451, 651, 488, 688, 685, 93, 440, 380, 126, 721, 328, 753, 470, 743, 527
        };

        // Loop through array in order
        for (int num : numbers) {
            // ✅ STOP immediately when we see 237 — do NOT print it
            if (num == 237) {
                break;
            }

            // ✅ Print ONLY even numbers, one per line
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}