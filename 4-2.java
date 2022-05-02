import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void Random(float[][] matrix)
    {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100 - (-100)) + (-100) + random.nextFloat();
            }
        }
    }

    public static void Output(float[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f\t",matrix[i][j] );
            }
            System.out.println();
        }
    }

	public static float[][] Sort(float[][]matrix)
	{
		for (int i = 0; i < matrix.length; i++){
			for (int k = 0; k < matrix[i].length - 1; k++) {
				for (int j = 0; j < matrix[i].length - 1; j++) {
					if (matrix[i][j] > matrix[i][j+1])
					{
						float tmp = matrix[i][j];
						matrix[i][j] = matrix[i][j+1];
                        matrix[i][j+1] = tmp;
					}
				}
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

        float A[][] = new float[rows][cols];
		System.out.println("Матриця:");
		Random(A);
		Output(A);
		System.out.println("Результат сортування:");
		Output(Sort(A));
    }
}
