'use client'

import axios from "axios"
import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import { Box, Button, Input } from '@mui/material';
import { NextPage } from "next";
import { AttachFile, FmdGood, ThumbUpAlt } from "@mui/icons-material";
import { MyTypography } from "@/app/components/common/style/cell";
import { PG } from "@/app/components/common/enums/PG";
import { IArticle } from "@/app/components/article/model/article";
import { useDispatch } from "react-redux";
import { saveArticle } from "@/app/components/article/service/article-service";
import { title } from "process";
import { useForm } from "react-hook-form";
import { jwtDecode } from "jwt-decode";
import { parseCookies } from "nookies";
import { findAllBoards } from "@/app/components/board/service/board-service";
import { useSelector } from "react-redux";
import { getAllBoards } from "@/app/components/board/service/board-slice";
import { IBoard } from "@/app/components/board/model/board";
// import React from "react";


const RegisterPage: NextPage = () => {
    const { register, handleSubmit, formState: { errors } } = useForm()
    // const [content, setContent] = useState("")
    const router = useRouter();
    const dispatch = useDispatch();
    // const [article, setArticle] = useState({} as IArticle)




    // const selectHandler = (e: any) => {
    //     setArticle({
    //         ...article,
    //         boardId: e.target.value

    //     })
    // }
    // const handleInsertTitle = (e: any) => {
    //     setArticle({
    //         ...article,
    //         title: e.target.value
    //     })
    // }
    // const handleInsertContent = (e: any) => {
    //     setArticle({
    //         ...article,
    //         content: e.target.value
    //     })
    // }
    // const handleSubmit = () => {
    //     console.log('user ...' + JSON.stringify(article))
    //     dispatch(saveArticle(article))
    //     alert("작성 완료")
    //     router.push(`${PG.ARTICLE}/list`)
    // }
    const handleCancel = () => {
        router.push(`${PG.ARTICLE}/list`)
    }



    const onSubmit = (data: any) => {
        alert(JSON.stringify(data))
        dispatch(saveArticle(data))
            .then((res: any) => {

                alert('게시글 작성 완료')
                console.log(data)
                console.log('res' + res)

            })
            .catch((err: any) => {

            })
    }

    useEffect(() => {
        dispatch(findAllBoards())
    }, [])

    const boardList: [] = useSelector(getAllBoards)

    return (<>

        <form onSubmit={handleSubmit(onSubmit)} className="max-w-sm mx-auto">
            <label htmlFor="countries" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white"> 게시판 선택 </label>
            <select {...register('id', { required: true })} id="countries" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 
focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                {
                    boardList.map((i: IBoard) => (
                        <option key={i.id} value={i.id}>{i.title}</option>
                    ))
                }
            </select><br />
            <div className="editor mx-auto w-10/12 flex flex-col text-gray-800 border border-gray-300 p-4 shadow-lg max-w-2xl">
                {MyTypography('게시글 작성', "1.5rem")}
                <input type="text" value={jwtDecode<any>(parseCookies().accessToken).userId} readOnly />
                <input {...register('title', { required: true, maxLength: 20 })} className="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none" placeholder=" 제 목" type="text" name="title" />
                <textarea  {...register('content', { required: true, maxLength: 300 })} className="description bg-gray-100 sec p-3 h-60 border border-gray-300 outline-none" placeholder="내 용"
                    name="content" ></textarea>
                {/* <!-- icons --> */}
                <div className="icons flex text-gray-500 m-2">
                    <svg className="mr-2 cursor-pointer hover:text-gray-700 border rounded-full p-1 h-7" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <ThumbUpAlt component={ThumbUpAlt}></ThumbUpAlt>
                    </svg>
                    <svg className="mr-2 cursor-pointer hover:text-gray-700 border rounded-full p-1 h-7" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <FmdGood component={FmdGood}></FmdGood>
                    </svg>
                    <svg className="mr-2 cursor-pointer hover:text-gray-700 border rounded-full p-1 h-7" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <AttachFile component={AttachFile}></AttachFile>
                    </svg>
                    <div className="count ml-auto text-gray-400 text-xs font-semibold">0/300</div>
                </div>
                {/* <!-- buttons --> */}
                <div className="buttons flex">
                    <div className="btn  overflow-hidden relative w-30 bg-white text-blue-500 p-3 px-4 rounded-xl font-bold uppercase -- before:block before:absolute before:h-full before:w-1/2 before:rounded-full
        before:bg-pink-400 before:top-0 before:left-1/4 before:transition-transform before:opacity-0 before:hover:opacity-100 hover:text-200 hover:before:animate-ping transition-all duration-00"
                        onClick={handleCancel}> 취소 </div>
                    {/* <div className="btn  overflow-hidden relative w-30 bg-blue-500 text-white p-3 px-8 rounded-xl font-bold uppercase -- before:block before:absolute before:h-full before:w-1/2 before:rounded-full
        before:bg-pink-400 before:top-0 before:left-1/4 before:transition-transform before:opacity-0 before:hover:opacity-100 hover:text-200 hover:before:animate-ping transition-all duration-00"
                    onSubmit={}> 저장 </div> */}
                    <input type="submit" value="SUBMIT" />
                </div>
            </div>
        </form >
    </>);
};
export default RegisterPage