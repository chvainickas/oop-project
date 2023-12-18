/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project;

import java.util.ArrayList;

/**
 *
 * @author Daniel García
 * 24 oct 2023
 */
public class Quiz {
    protected Question[] questionList;
    protected ArrayList<Character> userAnswers;
    protected int finalScore=0;

    public Quiz() {
        userAnswers = new ArrayList<>();
    }
    
    public void loadQuestions(){
        //load questions into array
        questionList = new Question[15];
        questionList[0] = new Question(1, "Which of the following is the biggest cause of global warming?", "earth.jpg", "Climate");
        questionList[1] = new Question(2, "How much has sea level risen since 1900 (global average)?", "glaciar.jpg", "Climate");
        questionList[2] = new Question(3, "What percentage of the earth’s atmosphere is comprised of carbon dioxide, the greenhouse gas?", "atmosphere.jpg", "Climate");
        questionList[3] = new Question(4, "Which of the following places has warmed the most, over the past 100 years?", "desert.jpg", "Climate");
        questionList[4] = new Question(5, "What percentage of the world’s electricity came from wind and solar power?", "solarEnergy.jpg", "Climate");
        
        questionList[5] = new Question(6, "What is the second leading cause of global warming after gas emmissions?", "globalWarming.jpg", "Ecosystems");
        questionList[6] = new Question(7, "Which land-based ecosystem has the most biodiversity?", "biodiversity.jpg", "Ecosystems");
        questionList[7] = new Question(8, "What is known as the \"Sixth Extinction\"?", "dodo.jpg", "Ecosystems");
        questionList[8] = new Question(9, "Global forests removed how much of the global human fossil fuel emissions annually from 1990 to 2007?", "forests.jpg", "Ecosystems");
        questionList[9] = new Question(10, "How much of the Earths land is covered by forests?", "moreforests.jpg", "Ecosystems");
        
        questionList[10] = new Question(11, "10,000 years ago, wild animals made up 99% of the weight of all vertebrates on Earth, and humans made up 1%. What is the composition of global vertebrate biomass today?", "pigs.jpg", "Wildlife");
        questionList[11] = new Question(12, "What is the percentage of dependance on pollinators of our crops?", "pollinator.jpg", "Wildlife");
        questionList[12] = new Question(13, "How many times the current rate of extinction of species is bigger than would it would be at natural rate?", "Extinct-Animals.jpg", "Wildlife");
        questionList[13] = new Question(14, "What is the main cause of the forest biodiversity loss?", "rabbit.jpg", "Wildlife");
        questionList[14] = new Question(15, "Which of these animal groups has the highest proportion of threatened species?", "axolote.jpeg", "Wildlife");        
    }
    
    public void loadAnswers(){
        //Load answers into questions
        Answer[] answers1 = new Answer[4];
        answers1[0] = new Answer('A', "Decomposing plants", false);
        answers1[1] = new Answer('B', "Burning oil, gas and coal", true);
        answers1[2] = new Answer('C', "Natural variation of the planet", false);
        answers1[3] = new Answer('D', "Pollution from wildfires", false);
        questionList[0].setAnswers(answers1);
        
        Answer[] answers2 = new Answer[4];
        answers2[0] = new Answer('A', "21cm", true);
        answers2[1] = new Answer('B', "58cm", false);
        answers2[2] = new Answer('C', "75cm", false);
        answers2[3] = new Answer('D', "3cm", false);
        questionList[1].setAnswers(answers2);
        
        Answer[] answers3 = new Answer[4];
        answers3[0] = new Answer('A', "0.04", true);
        answers3[1] = new Answer('B', "4.04", false);
        answers3[2] = new Answer('C', "1.05", false);
        answers3[3] = new Answer('D', "9.12", false);
        questionList[2].setAnswers(answers3);
        
        Answer[] answers4 = new Answer[4];
        answers4[0] = new Answer('A', "Marrakech, Morocco", false);
        answers4[1] = new Answer('B', "Basra, Iraq", false);
        answers4[2] = new Answer('C', "Vancouver, Canada", false);
        answers4[3] = new Answer('D', "Svalbard, Norway", true);
        questionList[3].setAnswers(answers4);
        
        Answer[] answers5 = new Answer[4];
        answers5[0] = new Answer('A', "15%", false);
        answers5[1] = new Answer('B', "33%", false);
        answers5[2] = new Answer('C', "50%", false);
        answers5[3] = new Answer('D', "9%", true);
        questionList[4].setAnswers(answers5);
        
        Answer[] answers6 = new Answer[4];
        answers6[0] = new Answer('A', "Deforestation", true);
        answers6[1] = new Answer('B', "Cow flatulences", false);
        answers6[2] = new Answer('C', "Human flatulences", false);
        answers6[3] = new Answer('D', "Volcano emissions", false);
        questionList[5].setAnswers(answers6);
        
        Answer[] answers7 = new Answer[4];
        answers7[0] = new Answer('A', "Deserts", false);
        answers7[1] = new Answer('B', "Tropical Rainforests", true);
        answers7[2] = new Answer('C', "The Tundra", false);
        answers7[3] = new Answer('D', "Grasslands", false);
        questionList[6].setAnswers(answers7);
        
        Answer[] answers8 = new Answer[4];
        answers8[0] = new Answer('A', "The fact that there are six major species in the world today that are facing extinction", false);
        answers8[1] = new Answer('B', "The sixth species that became extinct", false);
        answers8[2] = new Answer('C', "The Sequel to the movie The Fifth Element", false);
        answers8[3] = new Answer('D', "The current period of time where species are disappearing at an extreme rate", true);
        questionList[7].setAnswers(answers8);
        
        Answer[] answers9 = new Answer[4];
        answers9[0] = new Answer('A', "65%", false);
        answers9[1] = new Answer('B', "33%", true);
        answers9[2] = new Answer('C', "5%", false);
        answers9[3] = new Answer('D', "0%", false);
        questionList[8].setAnswers(answers9);
        
        Answer[] answers10 = new Answer[4];
        answers10[0] = new Answer('A', "5%", false);
        answers10[1] = new Answer('B', "10%", false);
        answers10[2] = new Answer('C', "16%", false);
        answers10[3] = new Answer('D', "31%", true);
        questionList[9].setAnswers(answers10);
        
        Answer[] answers11 = new Answer[4];
        answers11[0] = new Answer('A', "32% human, 67% livestock, 1% wildlife", true);
        answers11[1] = new Answer('B', "25% human, 25% livestock, 50% wildlife", false);
        answers11[2] = new Answer('C', "52% human, 33% livestock, 15% wildlife", false);
        answers11[3] = new Answer('D', "52% human, 18% livestock, 20% wildlife", false);
        questionList[10].setAnswers(answers11);
        
        Answer[] answers12 = new Answer[4];
        answers12[0] = new Answer('A', "5%", false);
        answers12[1] = new Answer('B', "12%", false);
        answers12[2] = new Answer('C', "58%", false);
        answers12[3] = new Answer('D', "35%", true);
        questionList[11].setAnswers(answers12);
        
        Answer[] answers13 = new Answer[4];
        answers13[0] = new Answer('A', "Between 20 and 40 times", false);
        answers13[1] = new Answer('B', "Between 1.000 and 10.000 times", true);
        answers13[2] = new Answer('C', "Over 20.000 times", false);
        answers13[3] = new Answer('D', "10 times", false);
        questionList[12].setAnswers(answers13);
        
        Answer[] answers14 = new Answer[4];
        answers14[0] = new Answer('A', "Expansion of urban areas", false);
        answers14[1] = new Answer('B', "Natural fires", false);
        answers14[2] = new Answer('C', "Human caused fires", false);
        answers14[3] = new Answer('D', "Agricultural expansion", true);
        questionList[13].setAnswers(answers14);
        
        Answer[] answers15 = new Answer[4];
        answers15[0] = new Answer('A', "Mammals", false);
        answers15[1] = new Answer('B', "Birds", false);
        answers15[2] = new Answer('C', "Anphibians", true);
        answers15[3] = new Answer('D', "Reptiles", false);
        questionList[14].setAnswers(answers15);
    }
            
    public Question[] getQuestionList() {
        return questionList;
    }

    public ArrayList<Character> getUserAnswers() {
        return userAnswers;
    }

}
