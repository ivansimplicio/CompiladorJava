package compiler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe que implementa o método para leitura do conteúdo de um arquivo de texto.
 * 
 * @author Ivan Simplício
 */
public class Arquivo {

	/**
	 * Realiza a leitura do conteúdo de um arquivo de texto.
	 * @param caminho do arquivo a ser lido.
	 * @return o conteúdo do arquivo aberto.
	 * @throws Exception será lançada caso ocorra algum erro na abertura ou leitura de um arquivo.
	 */
    public static String Read(String caminho) throws Exception {
        String conteudo = "";
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha + "\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                throw new Exception("ERRO: Não foi possível ler do arquivo!");
            }
        } catch (FileNotFoundException ex) {
            throw new Exception("ERRO: Arquivo não encontrado!");    
        }
    }
}