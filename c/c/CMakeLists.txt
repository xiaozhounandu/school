cmake_minimum_required(VERSION 3.23)
project(c)

set(CMAKE_CXX_STANDARD 14)


add_executable(q homework/Test/yuansu.cpp)
add_executable(w homework/Test/insert.cpp)
add_executable(e homework/Test/move.cpp)
add_executable(r homework/Test/auto_incr.cpp)
add_executable(Queue homework/Queue/Queue.cpp )
add_executable(Linkqueue homework/Queue/LinkQueue.cpp )
add_executable(newQueue homework/Queue/newQueue.cpp)

add_executable(slink homework/link/Slinknode1.cpp)
add_executable(sqlist homework/link/Sqlist.cpp)
add_executable(mainx homework/link/mainx.cpp)

add_executable(c homework/stack/Stack.cpp)
add_executable(L homework/stack/LinkStack.cpp)
add_executable(mainx1 homework/stack/testLink.cpp)


add_executable(coll homework/prase/collectq.cpp)


add_executable(sort homework/sort/insertSort.cpp)

add_executable(prim homework/graph/Prim.cpp)
add_executable(floyd homework/graph/Floyd.cpp)

add_executable(Dijkstra homework/graph/Dijkstra.cpp)
add_executable(Kruskal  homework/graph/Kruskal.cpp)







add_executable(data homework/his/data.cpp)
add_executable(score homework/his/score.cpp)
add_executable(String homework/his/String.cpp)

add_executable(SqString homework/SqString/SqString.cpp )
add_executable(newS homework/SqString/newSqString.cpp)



add_executable(newTree homework/tree/newTree.cpp )

add_executable(newhafuman homework/tree/haFumanTree.cpp)











