public class Matrix {

    private static int[][] temp;
    private static int nextEmpty = 0;

    private final int[][] matrix;
    private int rowCount;
    private int colCount;

    private Matrix() {
        matrix = temp;
        rowCount = temp.length;
        colCount = temp[0].length;
    }

    public static void setUpMatrix(int rowCount, int columnCount) {
        temp = new int[rowCount][columnCount];
    }

    public static void insertRow(int[] row) {
        if (row.length != temp[0].length) {
            throw new RuntimeException("Row length must fit the matrix dimensions.");
        }
        if (nextEmpty >= temp.length) {
            throw new RuntimeException("No empty rows available.");
        }

        for (int i = 0; i < row.length; i++) {
            temp[nextEmpty][i] = row[i];
        }
        nextEmpty++;
    }

    public static Matrix create() {
        Matrix m = new Matrix();

        temp = null;
        nextEmpty = 0;

        return m;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[ " + matrix[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m) {
        if (m.rowCount != this.rowCount || m.colCount != this.colCount) {
            throw new RuntimeException("Wrong matrix dimensions.");
        }
        for (int i = 0; i < m.rowCount; i++)
            for (int j = 0; j < m.colCount; j++)
                this.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
        return this;
    }

    public static Matrix add(Matrix m, Matrix n) {
        if (m.rowCount != n.rowCount || m.colCount != n.colCount) {
            throw new RuntimeException("Wrong matrix dimensions.");
        }
        Matrix tmp = n;
        for (int i = 0; i < tmp.rowCount; i++)
            for (int j = 0; j < tmp.colCount; j++)
                tmp.matrix[i][j] = m.matrix[i][j] + n.matrix[i][j];
        return tmp;
    }

    public Matrix subtract(Matrix m) {
        if (m.rowCount != this.rowCount || m.colCount != this.colCount) {
            throw new RuntimeException("Wrong matrix dimensions.");
        }
        for (int i = 0; i < m.rowCount; i++)
            for (int j = 0; j < m.colCount; j++)
                this.matrix[i][j] = this.matrix[i][j] - m.matrix[i][j];
        return this;
    }
}
