package LongerExample

import java.util.*

/**
 * Created by Dong on 2016-02-25.
 */

data class Point(val i: Int, val j: Int)

fun findPath(maze: Maze): List<Point>? {
    val previous = hashMapOf<Point, Point>()

    val queue = LinkedList<Point>()
    val visited = hashSetOf<Point>()

    queue.offer(maze.start)
    visited.add(maze.start)
    while (!queue.isEmpty()) {
        val cell = queue.poll()
        if (cell == maze.end) break

        for (newCell in maze.neighbors(cell.i, cell.j)) {
            if (newCell in visited) continue
            previous.put(newCell, cell)
            queue.offer(newCell)
            visited.add(cell)
        }
    }

    if (previous[maze.end] == null) return null

    val path = arrayListOf<Point>()
    var current = previous[maze.end]!!
    while (current != maze.start) {
        path.add(0, current)
        current = previous[current]!!
    }
    return path
}

/*
 * Find neighbors of the (i, j) cell that are not walls
 */
fun Maze.neighbors(i: Int, j: Int): List<Point> {
    val result = arrayListOf<Point>()
    addIfFree(i - 1, j, result)
    addIfFree(i, j - 1, result)
    addIfFree(i + 1, j, result)
    addIfFree(i, j + 1, result)
    return result
}

fun Maze.addIfFree(i: Int, j: Int, result: MutableList<Point>) {
    if (i !in 0..height - 1) return
    if (j !in 0..width - 1) return
    if (walls[i][j]) return

    result.add(Point(i, j))
}

/*
 * A data class that represents a maze
 */
class Maze(
        //Number or columns
        val width: Int,
        //Number of rows
        val height: Int,
        //true for a wall, false for free space
        val walls: Array<BooleanArray>,
        //The starting point(must not be a wall)
        val start: Point,
        //The target point(must not be a wall)
        val end: Point
) {}

/* A few maze examples here */
fun main(args: Array<String>) {
    walkThroughMaze("I $")
    walkThroughMaze("I O $")
    walkThroughMaze("""
    O  $
    O
    O
    O
    O           I
  """)
    walkThroughMaze("""
    OOOOOOOOOOO
    O $       O
    OOOOOOO OOO
    O         O
    OOOOO OOOOO
    O         O
    O OOOOOOOOO
    O        OO
    OOOOOO   IO
  """)
    walkThroughMaze("""
    OOOOOOOOOOOOOOOOO
    O               O
    O$  O           O
    OOOOO           O
    O               O
    O  OOOOOOOOOOOOOO
    O           O I O
    O               O
    OOOOOOOOOOOOOOOOO
  """)
}

//Utilities

fun walkThroughMaze(str: String) {
    val maze = makeMaze(str)

    println("Maze:")
    val path = findPath(maze)
    for (i in 0..maze.height - 1) {
        for (j in 0..maze.width - 1) {
            val cell = Point(i, j)
            print(
                    if (maze.walls[i][j]) "O"
                    else if (cell == maze.start) "I"
                    else if (cell == maze.end) "$"
                    else if (path != null && path.contains(cell)) "~"
                    else " "
            )
        }
        println("")
    }
    println("Result: " + if(path == null) "No path" else "Path found")
    println("")
}

fun makeMaze(s: String): Maze{
    val lines = s.split("\n")
    val longestLine = lines.toList().maxBy { it.length } ?: ""
    val data = Array(lines.size){ BooleanArray(longestLine.length)}

    var start: Point? = null
    var end: Point? = null

    for(line in lines.indices){
        for(x in lines[line].indices){
            val c = lines[line][x]
            when(c){
                'O' -> data[line][x] = true
                'I' -> start = Point(line, x)
                '$' -> end = Point(line, x)
            }
        }
    }
    return Maze(longestLine.length, lines.size, data, start ?: throw IllegalArgumentException("No starting point in the maze (should be indicated with 'I')"),
            end ?: throw IllegalArgumentException("No goal point in the maze(should be indicated with a '$' sign)"))
}

