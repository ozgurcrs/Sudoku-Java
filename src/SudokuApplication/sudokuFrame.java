
package SudokuApplication;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;

public class sudokuFrame extends javax.swing.JFrame implements ActionListener {

    public JButton[][] buttonArray = new JButton[9][9];
    int size = 9; int findColor; int emp = 0;
    public int [][] newArray = new int[9][9];
    
    int findZero;
    public sudokuFrame() {
        
        initComponents();
        startSudoku();
       
        int count = 0;
        
        for(int i = 0 ; i<9; i++)
             for(int k=0; k<9; k++)
              newArray[i][k] = sudoku99[i][k]; // Yapmış olduğumuz doğru matrisi tekrardan yedek bir şekilde yapıyoruz.
          
        
         startB(); //Starb fonksiyonunda işleme bakalım
        
     
    }
 
    
   
    
    public void startB()
    { // Bu fonksiyon matristeki bazı renkleri beyaz yapıyor kullanıcı seçim yapabilsin diye
        int findColor = 0;  
        for(int i = 0; i<size; i++)
        {
            for(int k = 0; k<size; k++)
            {
                findColor = rnd.nextInt(9)+1; // 1 den 9 a kadar sayı oluştur
                if(findColor >8) // O sayı 8 den büyükse matrisin o satır ve sutununu beyaz renk yap.
                {
                  newArray[i][k] = 0;
                 
                }
                buttonArray[i][k] = new JButton(); // Bir array buttonları oluşturuyoruz.
                if(newArray[i][k] == 1){ // Eğer 1 geldiyse rengini kırmızı yap
                    
                  buttonArray[i][k].setBackground(Color.red);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.red);
                } 
                else if(newArray[i][k] == 2) // 2 geldiyse rengini mavi yap...
                {
                    buttonArray[i][k].setBackground(Color.blue);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.blue);
                }
                    
                else if(newArray[i][k] == 3)
                {
                    buttonArray[i][k].setBackground(Color.DARK_GRAY);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.DARK_GRAY);
                }
                  
                else if(newArray[i][k] == 4)
                {
                    buttonArray[i][k].setBackground(Color.MAGENTA);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.MAGENTA);
                }
               
                else if(newArray[i][k] == 5)
                {
                    buttonArray[i][k].setBackground(Color.ORANGE);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.ORANGE);
                }    
                    
                else if(newArray[i][k] == 6)
                {
                    buttonArray[i][k].setBackground(Color.BLACK);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.BLACK);
                }   
                else if(newArray[i][k] == 7)
                {
                    buttonArray[i][k].setBackground(Color.PINK);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.PINK);
                }     
                  
                else if(newArray[i][k] == 8)
                {
                    buttonArray[i][k].setBackground(Color.YELLOW);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.YELLOW);
                }
                    
                else if(newArray[i][k] == 9)
                {
                    buttonArray[i][k].setBackground(Color.GREEN);
                        buttonArray[i][k].setText("."); 
                            buttonArray[i][k].setForeground(Color.GREEN);
                }   
                else if(newArray[i][k] == 0)
                    buttonArray[i][k].setBackground(Color.WHITE);
                
              
                buttonArray[i][k].addActionListener(this); // Panele ekleme yapacağımızı söylüyoruz i ve k satır ve sütunu temsil ediyor.
                buttonArray[i][k].setSize(40,40); // Butonların boyutlarını ayarlıyoruz..
                
                gamePanel.add(buttonArray[i][k]); // Butonları panele ekleme işlemi yapıyor.
                
            }
        }
    }
      @Override
    public void actionPerformed(ActionEvent e) //
    {
         for(int i = 0; i<size; i++)
        {
            for(int k = 0; k<size; k++)
            {
                if(e.getSource() == buttonArray[i][k]) // Buttonların renklerini ekliyoruz her random gelen sayıdan.
                {
                     
                  if(!buttonArray[i][k].getText().equals(".")) 
                  {
                      count++;
                     if(count == 1)
                  buttonArray[i][k].setBackground(Color.red); // Butonların rengini kırmızı yap.
                else if(count == 2)
                    buttonArray[i][k].setBackground(Color.blue);  // Butonların renklerini sırasıyla 0 dan 9 a kadar değiştiyoruz.
                else if(count == 3)
                    buttonArray[i][k].setBackground(Color.DARK_GRAY); //
                else if(count == 4)
                    buttonArray[i][k].setBackground(Color.MAGENTA);
                else if(count == 5)
                    buttonArray[i][k].setBackground(Color.ORANGE);
                else if(count == 6)
                    buttonArray[i][k].setBackground(Color.BLACK);
                else if(count == 7)
                    buttonArray[i][k].setBackground(Color.PINK);
                else if(count == 8)
                    buttonArray[i][k].setBackground(Color.YELLOW);
                else if(count == 9)
                    buttonArray[i][k].setBackground(Color.GREEN);
                else if(count == 0)
                    buttonArray[i][k].setBackground(Color.WHITE);
                     
                      newArray[i][k] = count;
                  }
                  
                     if(count >8)
                     {
                         count=0;
                     }
                   
                }
                
            }
        }
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 900));

        gamePanel.setLayout(new java.awt.GridLayout(9, 9, 30, 25));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kontrol Et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(700, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int counter = 0;
        for(int i = 0; i<9; i++)
        {
            for(int k = 0; k<9; k++)
            {
                if(newArray[i][k] == sudoku99[i][k]) // Eğer 0 yaptığımız matris ilk matrisimize eşitse artık hepsini doğru eklemiştir.
                {
                    
                    counter++; // Hepsi doğru eklenmişse 81 kere sayılmıştır.
                }
                
                else 
                {
                    if(!buttonArray[i][k].getText().equals("."))
                     buttonArray[i][k].setBackground(Color.WHITE); // Aynı değilse yine o butonları beyaz renk yap
                }
                
             
            }
        
        }
       
       
      
    
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sudokuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudokuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudokuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudokuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudokuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables


    Random rnd = new Random();
    final int [][] sudoku99 = new int[9][9];
    int count= 0,random,counter = 0,temp = 0,smash=0;
    
    void startSudoku()
    {
        createSudoku();
       
        for(int k = 0; k<9; k++)
        {
            for(int i = 0; i<9; i++)
            {
                 System.out.print("|"+sudoku99[k][i]+"| ");
            }
           
            
            System.out.println("");
           
        }
        
       
        
    }
    
    void createSudoku()
    {
       for(int k = 0 ; k<9; k++)
       {
            for(int i = 0 ; i<9; i++)
            {
                random = rnd.nextInt(9)+1;
                if(temp == random)
                    random = rnd.nextInt(9)+1;
   
                temp = random;
            
                if(controlSudoku(random,k,i) && control33(random,i,k))
                {
                    sudoku99[k][i] = random;
                    counter=0;

                }
            
                else 
                {
                     i--;
                    counter++;
                        if(counter > 100)
                            {  
                                for(int t = 0; t<9; t++)
                                {
                              
                                    sudoku99[k][t] = 0;
                                  
                                }
                                if(k>0)
                                    k=0;
                              
                                            counter = 0;
                                            
                                                   break;
                            }
                }
            
            }
           
       }
       
    }
    
    public boolean controlSudoku(int number,int b,int c)
    {
        
        for(int i = 0 ; i<9; i++)
        {
            if(sudoku99[b][i] == number )
            {
                return false;
            }
        }
        for(int i = 0 ; i<9; i++)
        {
            if(sudoku99[i][c] == number )
            {
                return false;
            }
        }
           
        return true;
    }
    
    
    boolean control33(int number,int i,int k)
    {
        if(i >= 0 && i<=2 && k>=0 && k<=2)
        {
            for(int t = 0; t<3; t++)
            {
               for(int c = 0; c<3; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
        
        if(i >= 3 && i<=5 && k>=0 && k<=2)
        {
            for(int t = 0; t<3; t++)
            {
               for(int c = 3; c<6; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
        
         if(i >= 6 && i<=8 && k>=0 && k<=2)
        {
            for(int t = 0; t<3; t++)
            {
               for(int c = 6; c<9; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
         
          if(i >= 0 && i<=2 && k>=3 && k<=5)
        {
            for(int t = 3; t<5; t++)
            {
               for(int c = 0; c<3; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
          
           if(i >= 3 && i<=5 && k>=3 && k<=5)
        {
            for(int t = 3; t<5; t++)
            {
               for(int c = 3; c<6; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
           
           
           if(i >= 6 && i<=8 && k>=3 && k<=5)
        {
            for(int t = 3; t<5; t++)
            {
               for(int c = 6; c<9; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
           
           
               if(i >= 0 && i<=2 && k>=6 && k<=8)
        {
            for(int t = 6; t<8; t++)
            {
               for(int c = 0; c<3; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
               
            if(i >= 3 && i<=5 && k>=6 && k<=8)
        {
            for(int t = 6; t<8; t++)
            {
               for(int c = 3; c<6; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
            
                if(i >= 6 && i<=8 && k>=6 && k<=8)
        {
            for(int t = 6; t<8; t++)
            {
               for(int c = 6; c<9; c++)
               {
                   if(sudoku99[t][c] == number)
                   {
                       return false;
                   } 
               }
            }
        }
           
        return true;
    }
    
}

    
