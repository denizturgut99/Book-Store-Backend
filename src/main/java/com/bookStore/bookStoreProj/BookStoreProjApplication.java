package com.bookStore.bookStoreProj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreProjApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData ( BookRepository bookRepository ) {
		return(args) -> {
			Books book1 = new Books("Dímelo en palabras", "https://preview.ibb.co/deD10Q/alex_min.png", "https://preview.ibb.co/bC5ELQ/alex_min.png", "El polifacético escritor catalán nos muestra en su novela más romántica como, básicamente, nuestra relación es tan fácil como decirnos las cosas como son. Tal cual.", "es");
			Books book2 = new Books("Lo veo negro", "https://preview.ibb.co/hnT0H5/eddie_min.png", "https://preview.ibb.co/dvM9AQ/eddie_min.png", "En ocasiones crees entender algo cuando te lo están explicando, pero en el momento de ponerte a programar surge siempre esta duda. ¿Lo ves?. Eduard Català se saca de la manga una obra maestra de la ciencia ficción.", "es");
			Books book3 = new Books("Mi algoritmo es más rápido", "https://preview.ibb.co/dUgbZk/flecha_min.png", "https://preview.ibb.co/nF3Un5/flecha_min.png", "De nuevo Guerrero, de nuevo el flecha. Un libro que te deja atado a su trama desde que abres la cubierta. Te atrapa rápido, muy rápido, hyper rápido.", "es");
			Books book4 = new Books("Amazing Design Art", "https://preview.ibb.co/f6J6qQ/joan_min.png", "https://preview.ibb.co/hPod4k/joan_min.png", "Delicado y cuidado en cada palabra, este segundo tomo de la Trilogía 'Amor Front-End' es de momento el más sofisticado del autor. Nos fascinó 'Romance CSS', nos encanta este, ¿Qué nos deparará 'Orgasmo JavaScript'?", "es");
			Books book5 = new Books("The Javascript Guru", "https://preview.ibb.co/fyBzn5/maruti_min.png", "https://preview.ibb.co/iVRAuk/maruti_min.png", "From India to Spain, this book explains us how your dreams like a developer can be real. Functions, Objects, Variables... All of JavaScript is here in this Amazing book.", "en");
			Books book6 = new Books("Azerbaijan Roulette", "https://preview.ibb.co/h3GbZk/oruc_min.png", "https://preview.ibb.co/n82iEk/oruc_min.png", "Meanwhile you wait for the next Code challenge you can play some football with your mates... GOOOOOOOAAAAL!!", "en");
			Books book7 = new Books("Java... what?", "https://preview.ibb.co/iwNGqQ/roosy_min.png", "https://preview.ibb.co/bHMWPk/roosy_min.png", "For those of you that don't understand nothing about new technologies, Mr. Roosy arrives to give you some ray of light in your darkness. You'll never ask Java...what? again.", "en");
			Books book8 = new Books("Digital Nomad", "https://preview.ibb.co/mJXuc5/vcarpio_min.png", "https://preview.ibb.co/n06LH5/vcarpio_min.png", "Entras a las 9 de la mañana, te repanchingas en tu silla, pones los pies en la mesa y empiezas a programar. La vida de un nómada digital puede ser maravillosa. Gran relato corto del Escritor y ex-programador de Facebook Victor Carpio.", "es");
			Books book9 = new Books("El por qué de no usar Mustache", "https://preview.ibb.co/fwyY6F/Albert_min.png", "https://preview.ibb.co/dPxsYv/Albert_min.png", "El famoso escritor Albert Lara nos enseña el poder de JavaScript para crear plantillas y las razones por las que un sistema ideado justamente para este fin como es Mustache, no siempre es la mejor opción...", "es");
			Books book10 = new Books("Shut up little bastards", "https://preview.ibb.co/dVLfmF/Bryn_min.png", "https://preview.ibb.co/e1z6tv/Bryn_min.png", "El silencio es necesario en estos tiempos para poder concentrarte. Bryn lucharÃ¡ contra viento y marea en esta cruda historia basada en hechos reales.", "es");
			Books book11 = new Books("Sudo mucho", "https://preview.ibb.co/mSBmRF/Eduardo_min.png", "https://preview.ibb.co/fqbmtv/Eduardo_min.png", "Para qué aprender JavaScript si puedes estar subiendo copas sin parar. La historia de Eduardo nos llevará de estar hundido en la mierda hasta seguir hundido en la mierda.", "es");
			Books book12 = new Books("No contéis conmigo", "https://preview.ibb.co/n5zHYv/Erica_min.png", "https://preview.ibb.co/ctuvmF/Erica_min.png", "Hay veces que no se puede soportar la presión. Este es uno de esos casos. Erica no lo consiguió pero hay gente que dice haberla visto en ciertas noches de verano...", "es");
			Books book13 = new Books("Asincronía y su puta madre", "https://preview.ibb.co/nKxFLa/Gerard_min.png", "https://preview.ibb.co/hBtc0a/Gerard_min.png", "¿Qué entendemos por asincronía? ¿Por qué existe en este maldito mundo? ¿No es suficientemente sencillo el mundo síncrono?. De Haro nos trae una obra de ciencia ficción con más de un giro que no te esperas.", "es");
			Books book14 = new Books("El java empieza ahorita", "https://preview.ibb.co/g1ZjDv/Juan_min.png", "https://preview.ibb.co/esZT6F/Juan_min.png", "HTML, CSS, JavaScript e incluso Jquery son juegos de niÃ±os para un hombre que se lo propone. Pero Java ya son palabras mayores. Un reto que hay que aceptar y asumir que serÃ¡ duro. La parte front quedó atrás, el Java empieza ahorita.", "es");
			Books book15 = new Books("document.write()", "https://preview.ibb.co/b0st6F/Lluis_min.png", "https://preview.ibb.co/jv3c0a/Lluis_min.png", "No necesito más. No quiero funciones que no sé como funcionan. Document.write() hace lo que quiero y cuando quiero. Trágico relato de un hombre con una obsesión...", "ca");
			Books book16 = new Books("Learning Syntax", "https://preview.ibb.co/dJuHYv/Muhammad_min.png", "https://preview.ibb.co/bBJXYv/Muhammad_min.png", "A man with the need to learn every word of every new programming language. An almost impossible goal that will make him struggle with life and with his interior.", "en");
			Books book17 = new Books("Design First", "https://preview.ibb.co/m72RRF/Nuria_min.png", "https://preview.ibb.co/ja3XYv/Nuria_min.png", "Por mucho que JavaScript ayude a darle funcionalidad a la pÃ¡gina, lo primordial es el diseño. Sin un buen diseÃ±o, una pagina cae por su propio peso. Nuria nos explica la importancia de un gran impacto visual.", "en");
			Books book18 = new Books("Code of Vincent", "https://preview.ibb.co/ci0rtv/Vicent_min.png", "https://preview.ibb.co/hCVqLa/Vicent_min.png", "El escritor fantástico Vicent Clapés nos trae una historia que narra como un simple programador consiguió convertirse en un autentico guerrero a base de código. Batallas contra dragones de Jquery y Magos de Javascript en una aventura de lo más freek.", "ca");
			Books book19 = new Books("El maestro del parÃ¡metro", "https://preview.ibb.co/gL0D6F/Victor_min.png", "https://preview.ibb.co/iVRmtv/Victor_min.png", "Cuando te das cuenta que 10 funciones similares se pueden transformar en una sola simplemente pasándole un par de parámetros te das cuenta de todo su potencial. Es entonces cuando de transformas en un maestro del parámetro.", "en");
			Books book20 = new Books("Local Storage", "https://preview.ibb.co/dDGWtv/Auger_min.png", "https://preview.ibb.co/dGcsYv/Auger_min.png", "Llamadas JSON, objetos Javascript, Table Sorter, iframe, pantallas de loading... Todo esto es tiempo perdido para el usuario. Necesitamos algo que nos ayude con eso. Aquí es donde entra el poder del Local Storage. Gotcha!!", "es");
			Books book21 = new Books("Difícil. A veces lo fácil aburre.", "https://preview.ibb.co/js1aLa/Edu_min.png", "https://preview.ibb.co/h8s4fa/Edu_min.png", "Cómo funciona un sort por dentro? ¿Por qué usar esta función y no inventar una que nos complique más la vida?. Estas y otras preguntas en un libro orientado a esas personas que piensan fuera de la caja.", "es");
			Books book22 = new Books("No lo entiendo", "https://preview.ibb.co/hJsRRF/Francesc_min.png", "https://preview.ibb.co/csHsYv/Francesc_min.png", "El escritor, en su biografía más completa hasta la fecha, nos pone en su piel durante su iniciación a la programación antes de trabajar en Google. Era joven, con toda la vida por delante, pero no entendía nada...", "es");
			Books book23 = new Books("La la la. City of code", "https://preview.ibb.co/iotN0a/Ignasi_min.png", "https://preview.ibb.co/gjX4fa/Ignasi_min.png", "Código, código y más código. Entre incontables líneas de código se cuela este programador con gran experiencia autor de otros Best Sellers como 'Tucutucu Master' o 'Métele chicha a mi salchicha'...", "es");
			Books book24 = new Books("Function Man", "https://preview.ibb.co/jSRaLa/Raul_min.png", "https://preview.ibb.co/cV1QmF/Raul_min.png", "Típico cuatro ojos que está todo el día programando y haciendo mierdas como esta, en este libro cuenta como crear más funciones que variables... Un loco.", "es");
			Books book25 = new Books("Java Di Janeiro", "https://preview.ibb.co/m0APDv/Gabriel_min.png", "https://preview.ibb.co/kHC9Va/Gabriel_min.png", "Con Java en la sangre y Php en las venas, desde Brasil llega este ex-músico para explicarnos todas las ventajas del, seguramente, mejor lenguaje del mundo.", "es");

			bookRepository.save(book1);
			bookRepository.save(book2);
			bookRepository.save(book3);
			bookRepository.save(book4);
			bookRepository.save(book5);
			bookRepository.save(book6);
			bookRepository.save(book7);
			bookRepository.save(book8);
			bookRepository.save(book9);
			bookRepository.save(book10);
			bookRepository.save(book11);
			bookRepository.save(book12);
			bookRepository.save(book13);
			bookRepository.save(book14);
			bookRepository.save(book15);
			bookRepository.save(book16);
			bookRepository.save(book17);
			bookRepository.save(book18);
			bookRepository.save(book19);
			bookRepository.save(book20);
			bookRepository.save(book21);
			bookRepository.save(book22);
			bookRepository.save(book23);
			bookRepository.save(book24);
			bookRepository.save(book25);
		};
	}
}
