package _05_netflix;

import javax.swing.JOptionPane;

public class NetflixQueueRunner {
	
public static void main(String[] args) {
	Movie ASilentVoice = new Movie("ASilentVoice",4);
	Movie HunterXHunterPhantomRouge = new Movie("HunterXHunterPhantomRouge",5);
	Movie HunterXHunterLastMission = new Movie("HunterXHunterLastMission",5);
	Movie MyHeroAcademiaTwoHeroes = new Movie("MyHeroAcademiaTwoHeroes",5);
	Movie MyHeroAcademiaHeroesRising = new Movie("MyHeroAcademiaHeroesRising",5);
	Movie TheSevenDeadlySinsPrisonersoftheSky = new Movie("TheSevenDeadlySinsPrisonersoftheSky",6);
	
	NetflixQueue Queue = new NetflixQueue();
	Queue.addMovie(ASilentVoice);
	Queue.addMovie(HunterXHunterPhantomRouge);
	Queue.addMovie(HunterXHunterLastMission);
	Queue.addMovie(MyHeroAcademiaTwoHeroes);
	Queue.addMovie(MyHeroAcademiaHeroesRising);
	Queue.addMovie(TheSevenDeadlySinsPrisonersoftheSky);
	
	Queue.printMovies();
	
	Movie BestMovie = Queue.getBestMovie();
	JOptionPane.showMessageDialog(null, "The best movie is " + BestMovie.getTitle());
	
	
}
}

