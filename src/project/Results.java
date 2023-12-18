/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author pylyp
 */
public class Results{
    protected Review[] explainations;
    protected int score=0;
    protected Connection conn;
    
    public Results() {
    }
    
    public void loadExplain(){
        explainations = new Review[15];
        explainations[0] = new Review (1, "The combustion of fossil fuels for energy is the biggest source of carbon dioxide emissions linked to human activity and a major cause of global warming.");
        explainations[1] = new Review (2, "Global sea level is rising due to thermal expansion (as the ocean gets warmer) and due to runoff from melting glaciers and ice caps.");
        explainations[2] = new Review (3, "Although carbon dioxide is only a small fraction of the earth’s atmosphere, it is a potent greenhouse gas. Today’s concentration of carbon dioxide, 415 parts per million, or 0.0415 per cent, is about 30 per cent higher than when modern records began in 1960.");
        explainations[3] = new Review (4, "The world has warmed about 1.2C on average, but regions closer to the poles are warming much faster than tropical regions. Svalbard has warmed 2.7C, compared with Marrakech (1.7C), Vancouver (1C) and Basra (1.8C).");
        explainations[4] = new Review (5, "Renewable energy was the only part of the energy sector that grew during 2020, as the pandemic and lockdowns hit energy demand globally, and wind and solar installations reached record levels.");
        explainations[5] = new Review (6, "Deforestation is the second leading cause of global warming worldwide, and it produces about 24% of global greenhouse gas emissions. Deforestation in the tropical rainforests contributes more carbon dioxide to the atmosphere than the sum of all cars and trucks that drive on the world’s roads.");
        explainations[6] = new Review (7, "Worldwide, the tropics contain the most biodiversity, with rainforests being the areas that are the most rich in species. Although the tropical forests only cover 6% of the Earth’s surface, they contain one half to three quarters of the world’s plant and animal species.");
        explainations[7] = new Review (8, "Elizabeth Kolbert, author of The Sixth Extinction, says that human behavior, particularly pertaining to use of fossil fuels and climate change, has led to a “Six Extinction” where many species are considered endangered and are disappearing.");
        explainations[8] = new Review (9, "A study conducted by the US Forest Service’s Northern Research Station found that between 1990 and 2007, global forests have removed 2.4 billion tons of carbon and have absorbed 8.8 billion tons of carbon dioxide from the atmosphere annually. This is equivalent to about one third of fossil fuel emissions. Forests, just like oceans, are carbon sinks.");
        explainations[9] = new Review (10, "According to the World Wildlife Fund, 31% of the Earth’s land is covered by forests. Forests produce oxygen and provide homes for both people and animals. Forests also provide food, water, clothing, and traditional medicine and act as carbon sinks.");
        explainations[10] = new Review (11, "Unfortunately, wild animals make up only 1% of all vertebrate biomass today, while humans make up 32% and the animals we farm dominate at 67%. Alongside ending population growth, a global shift to more plant-based diets is crucial to stemming biodiversity loss.");
        explainations[11] = new Review (12, "Three-fourths of the world’s flowering plants and about 35 percent of the world’s food crops depend on animal pollinators to reproduce. That’s one out of every three bites of food you eat. More than 3,500 species of native bees help increase crop yields. Some scientists estimate that one out of every three bites of food we eat exists because of animal pollinators like bees, butterflies and moths, birds and bats, and beetles and other insects.");
        explainations[12] = new Review (13, "This is the rate of species extinctions that would occur if we humans were not around.");
        explainations[13] = new Review (14, "While the construction of infrastructure and the expansion of urban areas contribute significantly to deforestation and forest degradation, and the associated loss of forest biodiversity, agricultural expansion continues to be the main driver, in turn driven by the need to feed ever more people. In 2019, a major international report on global food sustainability stated that 80% of extinction threats to mammal and bird species are due to agriculture.");
        explainations[14] = new Review (15, "According to the IUCN Red List of Threatened Species, 26% of mammals are at risk of extinction, as well as 41% of amphibians, 21% of reptiles, 13% of birds, 37% of sharks and rays, 33% of reef corals, 34% of conifers and 63% of cycads.");
        
    }
    
    public ArrayList<Leader> getLeaderList() {
    conn = ManageDB.setConnection();
    String query = "SELECT userName, score FROM users ORDER BY score DESC";
    ArrayList<Leader> leaderList = new ArrayList<>();

    try (Statement statement = conn.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {

        int userCount = 0;

        while (resultSet.next()) {
            String userName = resultSet.getString("userName");
            int score = resultSet.getInt("score");
            userCount++;
            Leader leader = new Leader(userName, score, userCount);
            leaderList.add(leader);
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Log the exception for debugging purposes
        // Handle the exception according to your application's requirements
        // You might want to throw a custom exception or return an empty list
    } finally {
        // Close resources (Connection, Statement, ResultSet) if needed
        // You might want to close them in a separate finally block
    }

    return leaderList;
}
    
    public int calculateScore(Quiz quiz){
        if(quiz.userAnswers.size() == quiz.questionList.length){
            //If both have 15
            for(int i=0; i<quiz.userAnswers.size(); i++)
            {
                Question q = quiz.questionList[i];
                if(q.checkAnswer(quiz.userAnswers.get(i))){
                    score++;
                }
            }
        }
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    
}
