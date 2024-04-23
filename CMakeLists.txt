cmake_minimum_required(VERSION 3.26)
project(algorithms)

set(CMAKE_CXX_STANDARD 14)

include(FetchContent)

FetchContent_Declare(json URL https://github.com/nlohmann/json/releases/download/v3.11.3/json.tar.xz)
FetchContent_MakeAvailable(json)

add_executable(Fun3 fun3/src/main.cpp)
target_link_libraries(Fun3 PRIVATE nlohmann_json::nlohmann_json)

add_executable(MAB supreme_leader_simulator.cpp)
