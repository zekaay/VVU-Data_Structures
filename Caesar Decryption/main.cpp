// To encrypt "I LOVE DATA STRUCTURES AND ALGORITHMS" using Caesar Cipher
#include <iostream>
using namespace std;

//a function for text encryption
string decrypt(string information, int key)
{
    string data = "";

    // traverse text
    for (int i=0;i<information.length();i++)
    {
        // apply transformation to each character
        // Encrypt Uppercase letters
        if (isupper(information[i]))
            data += char(int(information[i]+key-65)%26 +65);

    // Encrypt Lowercase letters
    else
        data += char(int(information[i]+key-97)%26 +97);
    }

    //display the encrypted text
    return data;
}

// Driver program to test the above function
int main()
{
    string information="LORYHGDWDVWUXFWXUHVDQGDOJRULWKPV";
    int key = 3;
    cout << "Text : " << information;
    cout << "\nKey: " << key;
    key=key%26;
    cout << "\nDecrypted Message: " << decrypt(information, 26-key);
    return 0;
}
