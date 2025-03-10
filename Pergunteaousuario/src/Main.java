import javax.swing.JOptionPane;




public class Main {
    public static void main(String[] args) {
    
        String  nome;
        int idade =  0;
        String profissao;
        
        // 🔹 Pedir o nome e garantir que não contenha números
        do{
        nome = JOptionPane.showInputDialog ("Digite seu nome:");
        if (nome !=null && nome.matches(".*\\d.*")){// Verifica se o nome contém números
        JOptionPane.showMessageDialog(null, "Nome nao pode conter numeros.Tente nomavente");    
        }
        
        } while (nome == null || nome.trim().isEmpty() || nome.matches(".*\\d.*"));
        
        
         // 🔹 Pedir a idade e garantir que seja um número válido
         boolean idadeValida = false;
         while (!idadeValida){
         try{
             String idadeTexto = JOptionPane.showInputDialog("Digite sua idade:");
              if (idadeTexto == null){ continue;}
         idade =  Integer.parseInt(idadeTexto);
         
         if (idade > 0){ idadeValida =  true;}
         
             } catch (NumberFormatException e){JOptionPane.showMessageDialog (null,"Por favor digite um numero valido");
             
             }
         
         }
        
        // 🔹 Pedir a profissão e garantir que n contenha numeros
        do{
          profissao = JOptionPane.showInputDialog("Digite sua profissao:");
          if (profissao != null && profissao.matches(".*\\d.*")){// Verifica se a profissão contém números
              JOptionPane.showMessageDialog(null, "Profissao nao pode conter numeros. Tente novamente");
          }
        } while (profissao == null || profissao.trim().isEmpty() || profissao.matches(".*\\d.*"));
        
        // 🔹 Exibir um resumo das informações
         String mensagem = "informacoes cadastradas:\n" +
                 "Nome: " + nome +"\n" +
                         "Idade: " + idade + " anos \n" +
                                 "Profissao:" + profissao;
         
         JOptionPane.showMessageDialog(null, mensagem);
                         
        
        
        
        
        
        
        
    }
    
}
