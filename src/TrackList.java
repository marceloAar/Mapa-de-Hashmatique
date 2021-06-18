//Marcelo Aceituno R
//Full Stack JAVA 0034
import java.util.HashMap;
import java.util.Set;

public class TrackList {

	public static void main(String[] args) {
		
		HashMap<String, String> track = new HashMap<String, String>();
		
        track.put("Me cortaron mal el pelo", "Por ahorrarme el peluquero\r\n"
        		+ "Me cortaron mal el pelo\r\n"
        		+ "Ay, ¿qué voy a hacer ahora?\r\n"
        		+ "Esto no tiene mejora\r\n"
        		+ "Mis amigos me van a molestar\r\n"
        		+ "A la escuela ya no puedo ni entrar\r\n"
        		+ "Mi compartidura en medio\r\n"
        		+ "Esto no tiene remedio\r\n"
        		+ "Por ahorrarme al peluquero\r\n"
        		+ "Ahora debo usar sombrero\r\n"
        		+ "Mis amigos me van a molestar\r\n"
        		+ "A la escuela ya no… ");
        track.put("Diente Blanco No Te Vayas", "Siempre fuiste el mas blanco\r\n"
        		+ "El que nunca tuvo sarro\r\n"
        		+ "No tuviste picaduras\r\n"
        		+ "Ni una sola carie.\r\n"
        		+ "\r\n"
        		+ "Y ahora sin previo aviso te soltaste\r\n"
        		+ "Ya no masticas nada como antes.\r\n"
        		+ "\r\n"
        		+ "Brillabas cuando sonreia\r\n"
        		+ "Y mascabamos pastillas\r\n"
        		+ "Nos comimos mil costillas\r\n"
        		+ "Sopaipillas con pure\r\n"
        		+ "Ahora no trituras nada\r\n"
        		+ "No muerdes leche nevada\r\n"
        		+ "Tal vez sea culpa mia\r\n"
        		+ "Dime diente dimelo.");
        track.put("Baila Sin Cesar", "Bailar sin cesar bailan sin cesar\r\n"
        		+ "hasta que aparezca\r\n"
        		+ "cesar y lo arruine todo (x2)\r\n"
        		+ "\r\n"
        		+ "que no baile cesar\r\n"
        		+ "bailan sin cesar\r\n"
        		+ "dejenme bailar\r\n"
        		+ "hasta que aparezca cesar y lo arruine todo (x2)\r\n"
        		+ "que no bailar cesar\r\n"
        		+ "yo quiero expresarme\r\n"
        		+ "dejenme bailar (x2)\r\n"
        		+ "\r\n"
        		+ "mi cuerpo pide baile\r\n"
        		+ "y ustedes no me dejan\r\n"
        		+ "yo quiero expresarme\r\n"
        		+ "ser libre con mi cuerpo\r\n"
        		+ "bailar es saludable\r\n"
        		+ "porque tan mala onda\r\n"
        		+ "soy un gran bailarin\r\n"
        		+ "yo quiero bailar ");
        track.put("Señora devuelvame el balon", "Siempre que yo juego a la pelota\r\n"
        		+ "se me cae a la casa de mi vecina\r\n"
        		+ "cuando trato de que me la devuelva\r\n"
        		+ "me cierra la puerta\r\n"
        		+ "y ni siquiera me mira.\r\n"
        		+ "\r\n"
        		+ "Ese cabro de porquería maldadoso\r\n"
        		+ "me tiene el patio lleno de pelotas\r\n"
        		+ "tiene a Sergio completamente nervioso\r\n"
        		+ "de un pelotazo casi me lo bota.");
       
        String cancion = track.get("Me cortaron mal el pelo");
        System.out.println("\n"+cancion+"\n"); 
        System.out.println("--------------------\n");      

        
        Set<String> keys = track.keySet();
        for(String key : keys) {
            System.out.println("\n"+key+"\n");
            System.out.println(track.get(key));    
        }
	}
}
