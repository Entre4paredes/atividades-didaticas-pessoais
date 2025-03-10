import javax.swing.*;// Para componentes gráficos
import java.awt.*;  // Para Layouts



public class JanelaTextoSimples {
    public static void main(String[] args){
     // Criando a janela principal
    JFrame janela = new JFrame("Caixa de texto simples");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Fechar a aplicação ao fechar a janela
    janela.setSize (400,200);// Tamanho da janela
    janela.setLayout(null); // Layout sem formato predefinido
    
     // Criando a caixa de texto onde o usuário pode digitar
     JTextField caixaTexto = new JTextField();
     caixaTexto.setBounds(50, 50, 300, 30); // Posição e tamanho da caixa de texto
     
     
       // Criando o botão
     JButton botao =new JButton ("Mostrar texto");
     botao.setBounds (50, 100, 150, 30);// Posição e tamanho do botão
     
     // Criando uma área de texto onde será mostrado o texto digitado
     JTextArea areaTexto = new JTextArea();
     areaTexto.setBounds (50, 150, 300, 50);// Posição e tamanho da área de texto
     areaTexto.setEditable(false); // Área de texto não será editável
     
     
      // Adicionando os componentes na janela 
      janela.add(caixaTexto);
      janela.add(botao);
      janela.add(areaTexto);
      
      // Exibindo a janela
      janela.setVisible(true);
      
      // Ação do botão
      botao.addActionListener(e ->{
      // Pegando o texto da caixa de texto e colocando na área de texto
      String texto = caixaTexto.getText();
      areaTexto.setText(texto);// Exibe o texto na área
      
      
      
      });
      
      
       
     
    }
}
