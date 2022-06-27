import java.io.*;
import java.util.*;

class revdigitpattern
    {
        public void main()
        {
            int x=1;
            int n= 123456;
            for(;n/x >9;)
            {
                x=x*10;
            }
            for(;x >0;)
            {
                int r=n/x;
                System.out.println(r);
                x=x/10;
            
            }
        }
    }
                
                
            