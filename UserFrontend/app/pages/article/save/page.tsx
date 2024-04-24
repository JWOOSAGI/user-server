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
// import React from "react";


const RegisterPage: NextPage = () => {
    const [content, setContent] = useState("")
    const selectHandler = (e: any) => {
        setArticle({
            ...article,
            boardId : e.target.value
            
        })
    }
    const router = useRouter();
    const dispatch = useDispatch();
    const [article, setArticle] = useState({} as IArticle)
    const handleCancel = () => {
        // router.push(`${PG.ARTICLE}/list`)
        console.log(article)
    }
    const handleInsertTitle = (e: any) => {
        setArticle({
            ...article,
            title: e.target.value
        })
    }
    const handleInsertContent = (e: any) => {
        setArticle({
            ...article,
            content: e.target.value
        })
    }
    const handleSubmit = () => {
        console.log('user ...' + JSON.stringify(article))
        dispatch(saveArticle(article))
        alert("작성 완료")
        router.push(`${PG.ARTICLE}/list`)
    }

    const options = [

        {id:1, title:"QnA", content:"QnA"},
        {id:2, title:"리뷰게시판", content:"리뷰게시판"},
        {id:3, title:"free", content:"자유게시판"},

    ]


    return (<>

        <form className="max-w-sm mx-auto">
            <label htmlFor="countries" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white"> 게시판 선택 </label>
            <select onChange={selectHandler} id="countries" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 
focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                {
                    Iboa.map((item, index)=>(
                        <option key={item.id} value={item.id}>{item.content}</option>
                    ))
                }
            </select><br />
        </form >
        <div className="editor mx-auto w-10/12 flex flex-col text-gray-800 border border-gray-300 p-4 shadow-lg max-w-2xl">
            {MyTypography('게시글 작성', "1.5rem")}
            <input className="title bg-gray-100 border border-gray-300 p-2 mb-4 outline-none" placeholder=" 제 목" type="text" name="title" onChange={handleInsertTitle} />
            <textarea className="description bg-gray-100 sec p-3 h-60 border border-gray-300 outline-none" placeholder="내 용"
                name="content" onChange={handleInsertContent}></textarea>
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
                <div className="btn  overflow-hidden relative w-30 bg-blue-500 text-white p-3 px-8 rounded-xl font-bold uppercase -- before:block before:absolute before:h-full before:w-1/2 before:rounded-full
        before:bg-pink-400 before:top-0 before:left-1/4 before:transition-transform before:opacity-0 before:hover:opacity-100 hover:text-200 hover:before:animate-ping transition-all duration-00"
                    onClick={handleSubmit}> 저장 </div>
            </div>
        </div>
    </>);
};
export default RegisterPage