import sys
import random
import token
# from tkinter import N


# def freopen(f, option, stream):
#     import os
#     oldf = open(f, option)
#     oldfd = oldf.fileno()
#     newfd = stream.fileno()
#     os.close(newfd)
#     os.dup2(oldfd, newfd)


for o in range(19):
    t = random.randrange(1, 50)
    file_name = "output"
    file_name += str(o)
    file_name += ".txt"

    with open(file_name, 'w', encoding='utf-8') as f:
        f.write(str(t))
        f.write("\n")
    for i in range(t):
        n = random.randrange(2, 1000)
        with open(file_name, 'a', encoding='utf-8') as f:
            f.write(str(n))
            f.write("\n")
        for j in range(n):
            h = random.randrange(1, 10**8)
            with open(file_name, 'a', encoding='utf-8') as f:
                f.write(str(h) + " ")
        with open(file_name, 'a', encoding='utf-8') as f:
            f.write("\n")


# for i in range(38):
#     file_name = "output"
#     file_name += str(i)
#     file_name += ".txt"
#     m = random.randrange(1, 50, 2)
#     n = random.randrange(1, 50, 1)
#     print(m, n)
#     with open(file_name, 'w', encoding='utf-8') as f:
#         f.write(str(m) + " " + str(n))

# # for i in range(m):
# #     for j in range(n):
# #         x = random.randint(1, 20)
# #         print(x, end=)

# m = random.randint(20, 50)
# n = random.randint(20, 50)
# print(m, end=' ')
# print(n)
# for i in range(m):
#     for j in range(n):
#         t = random.randint(1, 10000)
#         print(t, end=' ')
#     # file_name = "output" + str(i) + ".txt"
#     # for j in range(m):
#     #     t = random.randint(1, 20)
#     #     with open(file_name, 'w', encoding='utf-8') as f:
#     #         print(t, end=' ')
#     #         f.write(str(t))
#     #         f.write(' ')
#     print('')


# # for i in range(3):
# #     file_name = "output" + str(i) + ".txt"
# #     t = random.randint(1, 20)
# #     freopen(file_name, "w", sys.stdout)
# #     # with open(file_name, 'w', encoding='utf-8') as f:
# #     #     f.write(str(t))
# #     #     f.write('\n')

# #     for j in range(t):
# #         val1 = random.randint(1, 20)
# #         val2 = random.randint(1, 20)
# #         with open(file_name, 'w', encoding='utf-8') as f:
# #             f.write(str(val1))
# #             f.write(" ")
# #             f.write(str(val2))

# # t = random.randint(1, 100)
# # print(t)
# # for i in range(t):
# #     val1 = random.randint(1, 10000)
# #     val2 = random.randint(1, 10000)
# #     print(val1, ' ', val2)
