package com.example.service

import kotlin.random.Random

class Practice(private val rows: Int, private val columns: Int) {

    fun calculate():Array<Array<Int>> {

        val arr1 : Array<Array<Int>> = Array(rows) { Array(columns) { 0 } }
        val arr2 : Array<Array<Int>> = Array(rows) { Array(columns) { 0 } }
        var arr3 : Array<Array<Int>> = Array(rows) { Array(columns) { 0 } }

        for (i in 0 until rows) {
                for (j in 0 until columns) {
                    arr1[i][j] = Random.nextInt(1, 4)
                }
        }
                for (i in 0 until rows) {
                    for (j in 0 until columns) {
                        arr2[i][j] = Random.nextInt(1, 4)
                    }
                }


            for (i in 0 until rows) {
                for (j in 0 until columns) {
                    var sum = 0
                    for (k in 0 until columns) {
                        sum+=arr1[i][k] * arr2[k][j]
                    }
                   arr3[i][j] = sum
                }
            }




//        println("Matrix one ")
//            for (i in 0 until rows) {
//                for (j in 0 until columns) {
//                    print("${arr1[i][j]} ")
//                }
//                println()
//            }
//
//
//        println("Matrix two ")
//
//            for (i in 0 until rows) {
//                for (j in 0 until columns) {
//                    print("${arr2[i][j]} ")
//                }
//                println()
//            }
//
//println("========================================")
//            for (i in 0 until rows) {
//                for (j in 0 until columns) {
//                    print("${arr3[i][j]} ")
//                }
//                println()
//            }
        return arr3
    }


}