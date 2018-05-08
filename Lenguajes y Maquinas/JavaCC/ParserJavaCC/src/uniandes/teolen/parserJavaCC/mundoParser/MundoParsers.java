package uniandes.teolen.parserJavaCC.mundoParser;

import java.util.*;

import uniandes.teolen.parserJavaCC.Proyecto1.Proyecto1;
import uniandes.teolen.parserJavaCC.myParser.ParserCAML;
import uniandes.teolen.parserJavaCC.myParserDR.ParserDR;
import uniandes.teolen.parserJavaCC.newParser.NuevoParser;

public class MundoParsers {
	
	// Nombres de los Parsers
	private  ArrayList  <String> parsers  = new ArrayList <String> (); 
	
	// Parser que se está usando
	private int currentParser;
	
	
	public  MundoParsers () {
  	
		// Agreguen al final de esta lista los nombres del nuevo parser
		
	    parsers.add("ParserDR");
	    parsers.add("JavaCC");
	    parsers.add("Nuevo Parser");
	    parsers.add("Proyecto1");
	    currentParser =  0;

	}
	
	public ParserCAML getParserCAML(){
		return new ParserCAML(System.in);
	}
	
	public ParserDR getParserDR(){
		return new ParserDR();
	}
	
	public NuevoParser getNuevoParser(){
		return new NuevoParser(System.in);
	}
	
	public Proyecto1 getProyecto1() {
		return new Proyecto1(System.in);
	}
	
	public String getStringCurrentParser(){
		return parsers.get(currentParser);
	}
	
	public int getCurrentParser() {
		return currentParser;
	}
	
	public void setCurrentParser(int p) {
		currentParser = p;
	}
	
	public String getParser(int i) {
		return parsers.get(i);
	}
	
	public int sizeParsers() {
		return parsers.size();
	}
	
	public String  procesarCadena(String texto) {
		String resp = "";
		
		if(parsers.get(currentParser).equals("ParserDR")){
			ParserDR parserDR = getParserDR();
			parserDR.ReInit(new java.io.StringReader(texto));
			try {
		    	parserDR.Lexp(); 
		    	resp = new String("OK    \n");
		    }catch (Exception e) {
		        resp = new String ("Error de Sintaxis: "+e.getMessage());
		     } catch (Error e) {
		    	 resp = new String ("Error Lexico: "+e.getMessage());
		}
		}
		else if(parsers.get(currentParser).equals("JavaCC")){
			ParserCAML parserCAML = getParserCAML();
			parserCAML.ReInit(new java.io.StringReader(texto));
			ArrayList <Integer>  myList = new ArrayList <Integer> ();
			try {
		    	myList = parserCAML.camlList(); 
		    	resp = new String("OK    "+ myList + "\n");
		    	 
		    	
			}catch (Exception e) {
		        	resp = new String ("Error de Sintaxis: "+e.getMessage());
		    } catch (Error e) {
		    	 resp = new String ("Error Lexico: "+e.getMessage());
		    }
		}
		else if(parsers.get(currentParser).equals("Nuevo Parser")){
			NuevoParser nuevoParser = getNuevoParser();
			nuevoParser.ReInit(new java.io.StringReader(texto));
			try {
		    	nuevoParser.one_line(); 
		    	resp = new String("OK    \n");
		    }catch (Exception e) {
		        resp = new String ("Error de Sintaxis: "+e.getMessage());
		     } catch (Error e) {
		    	 resp = new String ("Error Lexico: "+e.getMessage());
		     }
		}
		else if(parsers.get(currentParser).equals("Proyecto1")){
			Proyecto1 proyecto1 = getProyecto1();
			proyecto1.ReInit(new java.io.StringReader(texto));
			try {
		    	proyecto1.pRed(); 
		    	resp = new String("OK    \n");
		    }catch (Exception e) {
		        resp = new String ("Error de Sintaxis: "+e.getMessage());
		     } catch (Error e) {
		    	 resp = new String ("Error Lexico: "+e.getMessage());
		     }
		}

		return "\n SISTEMA " + parsers.get(currentParser) + ": " + resp + "\n";
	}

}
