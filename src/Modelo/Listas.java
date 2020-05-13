/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Listas 
{
  private LinkedList<MCliente> ListaCliente = new LinkedList<>();  
  private LinkedList<MVigilante> ListaVigilante= new LinkedList<>();
  private LinkedList<MServicio> ListaServicios= new LinkedList<>();
  private LinkedList<MContrato> ListaContratos = new LinkedList<>();

//--------------------------------
    public void CargarClientes() {
        MCliente cliente = new MCliente();
        int Cnt;
        String Via;
        File archivo = null;   
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //archivo = new File ("C:\\Arbitros.txt");
            
            Via=System.getProperty("user.dir")+"/src/Archivos/Clientes.txt";
            
            archivo = new File (Via);
            
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            
            // Lectura del fichero
            String linea;
            
            Cnt=0;
            
            while((linea=br.readLine())!=null) //lee linea por linea el documento
            {
                Cnt++;
                
                switch (Cnt)
                {
                    case 1:
                        cliente.setIdCliente(linea);
                    break;
                        
                    case 2:cliente.setNombreCliente(linea);
                    break;
                    
                    case 3:cliente.setIdTipo(Integer.parseInt(linea));;
                    break;
                    
                    case 4:cliente.setTelefono(linea);
                    break;
                    
                    case 5: cliente.setDireccion(linea);
                
                    ListaCliente.add(cliente);    
                    cliente=new MCliente(); //Resetear
                    Cnt=0;
                    break;                       
                }               
            }          
        }
        catch(Exception e){
            
        }
        finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
            }
        }
    }
 
 //-----------------------------
 public void CargarVigilantes()
  {
     MVigilante vigilante =new MVigilante();
     int Cnt;
     String Via;
     File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
 
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Arbitros.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Vigilantes.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                   case 1: vigilante.setIdVigilante(linea);
                         break;
                      
                  case 2:vigilante.setNombre(linea);
                         break;
                      
                  case 3:vigilante.setApellido(linea);
                         break;
                      
                  case 4:vigilante.setCedula(linea);
                  
                        ListaVigilante.add(vigilante);   
                        vigilante = new MVigilante(); 
                         Cnt=0;
                         break; 
              }                             
            }                       
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }   
  }    
 
 //------cargar servicios---------------------
 
 public void cargarServicios()
 {
     MServicio ms = new MServicio();
     int Cnt;
     String Via;
     
     File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
 
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Arbitros.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Servicios.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                   case 1:  ms.setIdContrato(linea);
                         break;
                      
                  case 2:   ms.setIdCliente(linea);
                         break;
                      
                  case 3:   ms.setIdTurno(linea);
                         break;
                      
                 // case 4:   ms.setIdVigilantes(linea);
                  //      break;
                //  case 5:   ms.setBici(Boolean.parseBoolean(linea));
                  //      break;
                  //case 6:   ms.setRadio(Boolean.parseBoolean(linea));
                   //     break;
                  default:  ms.setFecha(linea);
           
                        ListaServicios.add(ms);   
                        ms = new MServicio(); 
                        Cnt=0;
                        break; 
              }                             
            }                       
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
               
            }                  
         }catch (Exception e2){ 
         }
      }   
 }
//--------------------------------------------

     public LinkedList<MServicio> getListaServicios() {
        return ListaServicios;
    }

    public void setListaServicios(LinkedList<MServicio> ListaServicios) {
        this.ListaServicios = ListaServicios;
    }
 
    public LinkedList<MCliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(LinkedList<MCliente> ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

    public LinkedList<MVigilante> getListaVigilante() {
        return ListaVigilante;
    }

    public void setListaVigilante(LinkedList<MVigilante> ListaVigilante) {
        this.ListaVigilante = ListaVigilante;
    }
    
    public void GuardarArchivoCliente(){
        
        try {
            MCliente cli;
            String Via;
            Via=System.getProperty("user.dir")+"/src/Archivos/Clientes.txt";
            int c = 0;
            
            FileWriter fw = new FileWriter(Via);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            while (c < ListaCliente.size()) {
                cli = ListaCliente.get(c);
                pw.println(cli.getIdCliente());
                pw.println(cli.getNombreCliente());
                pw.println(cli.getIdTipo());
                pw.println(cli.getTelefono());
                pw.println(cli.getDireccion());
                c++; 
            }
            pw.close();
        }
        catch (Exception e) {
            
        }
    }
    
        public void GuardarArchivoVigilante(){
        
        try {
            MVigilante vig;
            String Via;
            Via = System.getProperty("user.dir")+"/src/Archivos/Vigilantes.txt";
            int c = 0;
            
            FileWriter fw = new FileWriter(Via);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            while(c<ListaVigilante.size()){    
            vig = ListaVigilante.get(c);
            pw.println(vig.getIdVigilante());
            pw.println(vig.getNombre());
            pw.println(vig.getApellido());
            pw.println(vig.getCedula());
            c++;
            }
            pw.close();
        }
        catch (Exception e) {
            
        }
    }

        public void GuargarArchivoServicios()
        {
             try {
            MServicio ms;
            String Via;
            Via=System.getProperty("user.dir")+"/src/Archivos/Servicios.txt";
            int c = 0;
            
            FileWriter fw = new FileWriter(Via);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            while (c < ListaServicios.size()) {
                ms = ListaServicios.get(c);
                pw.println(ms.getIdContrato());
                pw.println(ms.getIdCliente());
                pw.println(ms.getIdTurno());
                pw.println(ms.getIdVigilantes());
                //pw.println(Boolean.toString(ms.getBici()));
                //pw.println(Boolean.toString(ms.getRadio()));
                pw.println(ms.getFecha());
                
                c++; 
            }
            pw.close();
        }
        catch (Exception e) {
            
        }
        }

    public LinkedList<MContrato> getListaContratos() {
        return ListaContratos;
    }

    public void setListaContratos(LinkedList<MContrato> ListaContratos) {
        this.ListaContratos = ListaContratos;
    }
        
        
} 
