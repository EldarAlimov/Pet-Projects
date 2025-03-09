#include <type_traits>

template <char... C>
struct make_string {
    static constexpr const char value[sizeof...(C) + 1] = {C..., '\0'};
};

template <char... C>
constexpr const char make_string<C...>::value[];

template <const char* Str1, const char* Str2>
struct ct_strcmp_helper {
    static constexpr bool compare() {
        for (int i = 0; Str1[i] != '\0' || Str2[i] != '\0'; ++i) {
            if (Str1[i] != Str2[i]) {
                return false;
            }
        }
        return true;
    }
};

template <const char* Str1, const char* Str2>
constexpr bool ct_strcmp() {
    return ct_strcmp_helper<Str1, Str2>::compare();
}