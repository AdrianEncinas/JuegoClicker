package juegoclicker;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.*;

 class sumaCadaNumero {
   private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
   int x = 0;
   int j = 1;
   public void sumaCadaSegundo() {
     final Runnable suma = new Runnable() {
       public void run() { 
           x = x+j;
           System.out.println(x);}
     };
     final ScheduledFuture<?> sumaValores = scheduler.scheduleAtFixedRate(suma, 1, 1, SECONDS);
     
     scheduler.schedule(new Runnable() {
       public void run() { sumaValores.cancel(true); }
     }, 1200 * 1200, SECONDS);
   }
 }