package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class QuestionsDTO {
    @JsonProperty("clues")
    public List<Clues> clues;
    private String id;
    private String answer;
    private int value;
    private int categoryId;
    private int gameId;

    public List<Clues> getClues() {
        return clues;
    }

    public void setClues(List<Clues> clues) {
        this.clues = clues;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public static class Clues {
        @JsonProperty("canon")
        public String canon;
        @JsonProperty("game")
        public Game game;
        @JsonProperty("category")
        public Category category;
        @JsonProperty("invalidCount")
        public String invalidCount;
        @JsonProperty("gameId")
        public String gameId;
        @JsonProperty("categoryId")
        public String categoryId;
        @JsonProperty("value")
        public String value;
        @JsonProperty("question")
        public String question;
        @JsonProperty("answer")
        public String answer;
        @JsonProperty("id")
        public String id;

        public String getCanon() {
            return canon;
        }

        public void setCanon(String canon) {
            this.canon = canon;
        }

        public Game getGame() {
            return game;
        }

        public void setGame(Game game) {
            this.game = game;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public String getInvalidCount() {
            return invalidCount;
        }

        public void setInvalidCount(String invalidCount) {
            this.invalidCount = invalidCount;
        }

        public String getGameId() {
            return gameId;
        }

        public void setGameId(String gameId) {
            this.gameId = gameId;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Clue " + this.id+ "{\n" +
                    "question='" + question + '\'' +
                    ",\n answer='" + answer + '\'' +
                    ",\n category=" + this.getCategory() + '\'' +
                    "\n}";
        }
    }

    public static class Game {
        @JsonProperty("canon")
        public String canon;
        @JsonProperty("aired")
        public String aired;

        public String getCanon() {
            return canon;
        }

        public void setCanon(String canon) {
            this.canon = canon;
        }

        public String getAired() {
            return aired;
        }

        public void setAired(String aired) {
            this.aired = aired;
        }
    }

    public static class Category {
        @JsonProperty("canon")
        public String canon;
        @JsonProperty("title")
        public String title;
        @JsonProperty("id")
        public String id;

        //setters and getters

        public String getCanon() {
            return canon;
        }

        public void setCanon(String canon) {
            this.canon = canon;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        //tostring

        @Override
        public String toString() {
            return title;
        }
    }
}
