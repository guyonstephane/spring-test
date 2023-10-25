package com.example.kotlinmysql.model;

import jakarta.persistence.*


@Entity
@Table(name = "articles")
data class Article (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "article_id")
        val id: Int = 0,

        val title: String = "",

        val contents: String = ""
)