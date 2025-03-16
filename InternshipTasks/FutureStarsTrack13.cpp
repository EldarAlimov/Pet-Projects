#include <iostream>
#include <vector>
#include <random>
#include <chrono>

double sum_random_elements(const std::vector<double>& A, size_t K) {
    size_t N = A.size();
    if (N == 0 || K == 0) return 0.0;

    std::random_device rd;
    std::mt19937 gen(rd());  // Mersenne Twister PRNG
    std::uniform_int_distribution<size_t> dist(0, N - 1);

    double sum = 0.0;
    for (size_t i = 0; i < K; ++i) {
        sum += A[dist(gen)];  // Select a random element with replacement
    }

    return sum;
}

int main() {
    size_t N = 50000000;  // Example large N
    size_t K = 50000000;  // Example large K

    // Generate a large array of doubles
    std::vector<double> A(N);
    for (size_t i = 0; i < N; ++i) {
        A[i] = static_cast<double>(i) / N;  // Example values
    }

    auto start = std::chrono::high_resolution_clock::now();
    double result = sum_random_elements(A, K);
    auto end = std::chrono::high_resolution_clock::now();

    std::cout << "Sum: " << result << "\n";
    std::cout << "Time taken: "
              << std::chrono::duration<double>(end - start).count()
              << " seconds\n";

    return 0;
}