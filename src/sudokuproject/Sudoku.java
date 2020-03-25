package sudokuproject;

import java.util.Random;

public class Sudoku 
{
    Random rnd = new Random(); // bir tane random sınıfı ekliyoruz.
    int [][] sudoku99 = new int[9][9]; //  9 9 a bir matris oluşturuyoruz.
    int count= 0,random,counter = 0,temp = 0,smash=0; //
    
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
       for(int k = 0 ; k<9; k++) // Satıra ekleme yapan for döngüsü
       {
            for(int i = 0 ; i<9; i++) // Sutuna ekleme yapan for döngüsü
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
    
    
    boolean controlSudoku(int number,int b,int c)
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
