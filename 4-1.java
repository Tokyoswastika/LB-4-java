import java.util.Scanner;

public class Main {
    public static void Input(int[][] matrix)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public static void Output(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



	public static int[][] SwapHalws(int[][] matrix)
	{
        int M =  matrix[0].length;
		for (int i = 0; i < matrix.length; ++i){
			for (int j = 0; j < matrix[i].length / 2; ++j) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][M / 2 + M % 2 + j];
				matrix[i][M / 2 + M % 2 + j] = temp;
			}
		}
        return matrix;
	}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows, cols;

        do {
            System.out.print("Введіть кількість рядків матриці:");
            rows = in.nextInt();
            if(rows < 1) System.out.println("Кількість рядків матриці не може бути меньше 1!");
        }
        while (rows < 1);

        do {
            System.out.print("Введіть кількість стопвчиків матриці:");
            cols = in.nextInt();
            if(cols < 1) System.out.println("Кількість стопвчиків матриці не може бути меньше 1!");
        }
        while (cols < 1);

        int[][] A = new int[rows][cols];
		System.out.println("Введіть матрицю:");
		Input(A);
		System.out.println("Матриця:");
		Output(A);
		System.out.println("Результат:");
		Output(SwapHalws(A));
    }
}
