package com.example.weatherapp

data class Todo (var userID:Int, var id: Int, var title: String, var completed: Boolean){
    override fun toString(): String {
        return "Todo(userID=$userID, id=$id, title='$title', completed=$completed)"
    }
}