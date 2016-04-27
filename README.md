Cryptographic hash function is an algorithm that takes block of data of arbitrary length as an input and output a short fixed length sequence of bit (usually 128 ~ 256 bits) and which ideally should have following four properties.
1. It is very easy to compute the hash value for any message.
2. It is infeasible to generate a message that has given hash data
3. It is infeasible to modify a message without changing the hash
4. It is infeasible to generate two different messages with the same hash

Cryptographic hash function is one-way functions to compute its value easily but it is technically impossible to get the original message back that has given hash value.

Java supports the most popular cryptographic hash functions as below:
- MD5
- SHA-1
- SHA-256
- SHA-384
- SHA-512