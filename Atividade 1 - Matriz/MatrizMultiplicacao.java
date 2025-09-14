import java.io.*;
import java.util.*;

public class MatrizMultiplicacao {
    
    public static void main(String[] args) {
        String arquivo = "C:\\Users\\Gabriel Franco\\Documents\\Faculdade\\Quarto período\\Primeiro Bimestre\\Programação orientada a objeto - Thalyse.duarte\\Matriz\\matrizes.txt";
        try {
            List<int[][]> matrizes = lerMatrizesDoArquivo(arquivo);
            
            if (matrizes.size() < 2) {
                System.out.println("Erro: O arquivo deve conter pelo menos duas matrizes.");
                return;
            }
            
            int[][] matrizA = matrizes.get(0);
            int[][] matrizB = matrizes.get(1);
            
            if (!ehQuadrada(matrizA) || !ehQuadrada(matrizB)) {
                System.out.println("Erro: Uma ou ambas as matrizes não são quadradas.");
                return;
            }
            
            if (matrizA[0].length != matrizB.length) {
                System.out.println("Erro: Matrizes não podem ser multiplicadas devido a dimensões incompatíveis.");
                return;
            }
            
            System.out.println("Matriz A:");
            imprimirMatriz(matrizA);
            System.out.println("\nMatriz B:");
            imprimirMatriz(matrizB);
            
            int[][] resultado = multiplicarMatrizes(matrizA, matrizB);
            
            System.out.println("\nMatriz Resultante (A x B):");
            imprimirMatriz(resultado);
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo ou processar matrizes: " + e.getMessage());
        }
    }
    
    // Lê duas ou mais matrizes de arquivo txt, separadas por linha em branco
    public static List<int[][]> lerMatrizesDoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        List<int[][]> matrizes = new ArrayList<>();
        
        List<int[]> temp = new ArrayList<>();
        String linha;
        
        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            if (linha.isEmpty()) { // linha vazia significa nova matriz
                if (!temp.isEmpty()) {
                    matrizes.add(converterListaParaMatriz(temp));
                    temp.clear();
                }
            } else {
                String[] nums = linha.split("\\s+");
                int[] linhaInt = new int[nums.length];
                for (int i = 0; i < nums.length; i++) {
                    linhaInt[i] = Integer.parseInt(nums[i]);
                }
                temp.add(linhaInt);
            }
        }
        // adiciona última matriz caso não tenha linha vazia no fim
        if (!temp.isEmpty()) {
            matrizes.add(converterListaParaMatriz(temp));
        }
        
        br.close();
        return matrizes;
    }
    
    // Converte lista de arrays de int para matriz 2D
    private static int[][] converterListaParaMatriz(List<int[]> lista) {
        int linhas = lista.size();
        int colunas = lista.get(0).length;
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            matriz[i] = lista.get(i);
        }
        return matriz;
    }
    
    // Verifica se matriz é quadrada
    public static boolean ehQuadrada(int[][] matriz) {
        int linhas = matriz.length;
        for (int i = 0; i < linhas; i++) {
            if (matriz[i].length != linhas) return false;
        }
        return true;
    }
    
    // Função de soma de dois números
    public static int soma(int a, int b) {
        return a + b;
    }
    
    // Função de multiplicação de dois números
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    
    // Multiplica matrizes usando as funções soma e multiplicacao e imprime passo a passo
    public static int[][] multiplicarMatrizes(int[][] A, int[][] B) {
        int n = A.length;
        int[][] resultado = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = 0;
                System.out.printf("Calculando elemento [%d][%d]:\n", i, j);
                for (int k = 0; k < n; k++) {
                    int prod = multiplicacao(A[i][k], B[k][j]);
                    System.out.printf("  A[%d][%d] * B[%d][%d] = %d * %d = %d\n", i, k, k, j, A[i][k], B[k][j], prod);
                    resultado[i][j] = soma(resultado[i][j], prod);
                    System.out.printf("  Soma parcial: %d\n", resultado[i][j]);
                }
                System.out.printf("Resultado final para elemento [%d][%d]: %d\n\n", i, j, resultado[i][j]);
            }
        }
        return resultado;
    }
    
    // Imprime matriz no console
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elem : linha) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}