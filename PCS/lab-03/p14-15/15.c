#include <stdio.h>

#include "utilities.h" 

int main(void)
{
    init_random();

    unsigned long suitID = random_in_range(1, 4);
    char *suit;
    if (suitID == 1)      suit = "Spades";
    else if (suitID == 2) suit = "Clubs";
    else if (suitID == 3) suit = "Hearts";
    else if (suitID == 4) suit = "Diamonds";

    unsigned long rankID = random_in_range(1, 13);
    char *rank;
    switch (rankID)
    {
        case 1:  rank = "A";     break;
        case 2:  rank = "Two";   break;
        case 3:  rank = "Three"; break;
        case 4:  rank = "Four";  break;
        case 5:  rank = "Five";  break;
        case 6:  rank = "Six";   break;
        case 7:  rank = "Seven"; break;
        case 8:  rank = "Eight"; break;
        case 9:  rank = "Nine";  break;
        case 10: rank = "Ten";   break;
        case 11: rank = "Jack";  break;
        case 12: rank = "Queen"; break;
        case 13: rank = "King";  break;
    }

    printf("The card you have picked is %s of %s.\n", rank, suit);

    return 0;
}
